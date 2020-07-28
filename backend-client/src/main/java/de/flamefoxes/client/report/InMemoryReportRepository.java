package de.flamefoxes.client.report;

import de.flamefoxes.report.ChangeReportRequest;
import de.flamefoxes.report.ChangeReportResponse;
import de.flamefoxes.report.CreateReportRequest;
import de.flamefoxes.report.CreateReportResponse;
import de.flamefoxes.report.DeleteReportRequest;
import de.flamefoxes.report.DeleteReportResponse;
import de.flamefoxes.report.FindReportRequest;
import de.flamefoxes.report.FindReportResponse;
import de.flamefoxes.report.Report;
import de.flamefoxes.report.ReportServiceGrpc.ReportServiceBlockingStub;

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
