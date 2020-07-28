package de.flamefoxes.report;

import de.flamefoxes.sql.Mysql;
import io.grpc.stub.StreamObserver;
import java.util.Optional;

public class ReportService extends ReportServiceGrpc.ReportServiceImplBase {
  private ReportRepository reportRepository;

  public ReportService() { reportRepository = SqlReportRepository.create(Mysql.connection); }

  @Override
  public void create(
      CreateReportRequest request,
      StreamObserver<CreateReportResponse> responseObserver
  ) {
    Report report = request.getReport();
    reportRepository.create(report);
    CreateReportResponse response = createReportResponse(report);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private CreateReportResponse createReportResponse(Report report) {
    return CreateReportResponse.newBuilder()
        .setReport(report)
        .build();
  }

  @Override
  public void find(
      FindReportRequest request,
      StreamObserver<FindReportResponse> responseObserver
  ) {
    String name = request.getName();
    Optional<Report> reportOptional = reportRepository.find(name);
    Report report = reportOptional.orElse(noSuchReport());
    FindReportResponse response = findReportResponse(report);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private FindReportResponse findReportResponse(Report report) {
    return FindReportResponse.newBuilder()
        .setReport(report)
        .build();
  }

  private Report noSuchReport() {
    return Report.newBuilder()
        .setReported("")
        .setReportedBy("")
        .setServer("")
        .setReason("")
        .build();
  }

  @Override
  public void delete(
      DeleteReportRequest request,
      StreamObserver<DeleteReportResponse> responseObserver
  ) {
    String name = request.getName();
    reportRepository.delete(name);
    DeleteReportResponse response = deleteReportResponse(name);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  private DeleteReportResponse deleteReportResponse(String name) {
    return DeleteReportResponse.newBuilder()
        .setName(name)
        .build();
  }

  @Override
  public void change(
      ChangeReportRequest request,
      StreamObserver<ChangeReportResponse> responseObserver
  ) {
    Report report = request.getReport();
    reportRepository.change(report);
    ChangeReportResponse changeReportResponse = changeReportResponse(report);
    responseObserver.onNext(changeReportResponse);
    responseObserver.onCompleted();
  }

  private ChangeReportResponse changeReportResponse(Report report) {
    return ChangeReportResponse.newBuilder()
        .setReport(report)
        .build();
  }

  public static ReportService create() {
    return new ReportService();
  }
}