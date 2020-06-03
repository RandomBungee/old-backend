package com.gitlab.leonklein.client.report;

import com.gitlab.leonklein.punishment.DeletePunishResponse;
import com.gitlab.leonklein.report.ChangeReportRequest;
import com.gitlab.leonklein.report.ChangeReportResponse;
import com.gitlab.leonklein.report.CreateReportRequest;
import com.gitlab.leonklein.report.CreateReportResponse;
import com.gitlab.leonklein.report.DeleteReportRequest;
import com.gitlab.leonklein.report.DeleteReportResponse;
import com.gitlab.leonklein.report.FindReportRequest;
import com.gitlab.leonklein.report.FindReportResponse;
import com.gitlab.leonklein.report.Report;
import com.gitlab.leonklein.report.ReportServiceGrpc.ReportServiceBlockingStub;
import io.grpc.stub.ServerCalls.UnaryMethod;

public class InMemoryReportRepository implements ReportRepository {
  private final ReportServiceBlockingStub REPORT_SERVICE;

  private InMemoryReportRepository(ReportServiceBlockingStub blockingStub) {
    REPORT_SERVICE = blockingStub;
  }

  @Override
  public void create(
      String reported,
      String server,
      String reason,
      String reportedBy
  ) {
    CreateReportRequest request = createReportRequest
        (reported, server, reason, reportedBy);
    CreateReportResponse response = REPORT_SERVICE.create(request);
    System.out.println("Report was created: " + response.getReport().getReported());
  }

  private CreateReportRequest createReportRequest(
      String reported,
      String server,
      String reason,
      String reportedBy
  ) {
    return CreateReportRequest.newBuilder()
        .setReport(createReport(
            reported,
            server,
            reason,
            reportedBy
        ))
        .build();
  }

  private Report createReport(
      String reported,
      String server,
      String reason,
      String reportedBy
  ) {
    return Report.newBuilder()
        .setReported(reported)
        .setServer(server)
        .setReason(reason)
        .setReportedBy(reportedBy)
        .build();
  }



  @Override
  public void delete(String name) {
    DeleteReportRequest request = deleteReportRequest(name);
    DeleteReportResponse response = REPORT_SERVICE.delete(request);
    System.out.println("Report was deleted: " + response.getName());
  }

  private DeleteReportRequest deleteReportRequest(String name) {
    return DeleteReportRequest.newBuilder()
        .setName(name)
        .build();
  }

  @Override
  public void change(String name, String server) {
    Report report = find(name);
    Report changeReport = changeReport(report, name, server);
    ChangeReportRequest request = changeReportRequest(changeReport);
    ChangeReportResponse response = REPORT_SERVICE.change(request);
    System.out.println("Report was updated: " + response.getReport().getServer());
  }

  private ChangeReportRequest changeReportRequest(
      Report report
  ) {
    return ChangeReportRequest.newBuilder()
        .setReport(report)
        .build();
  }

  private Report changeReport(
      Report report,
      String name,
      String server
  ) {
    return Report.newBuilder()
        .setReported(name)
        .setReportedBy(report.getReportedBy())
        .setReason(report.getReportedBy())
        .setServer(server)
        .build();
  }

  @Override
  public Report find(String name) {
    FindReportRequest request = findReportRequest(name);
    FindReportResponse response = REPORT_SERVICE.find(request);
    return response.getReport();
  }

  private FindReportRequest findReportRequest(String name) {
    return FindReportRequest.newBuilder()
        .setName(name)
        .build();
  }

  public static InMemoryReportRepository create(ReportServiceBlockingStub blockingStub) {
    return new InMemoryReportRepository(blockingStub);
  }
}
