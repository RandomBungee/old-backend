package com.gitlab.leonklein.client.report;

import com.gitlab.leonklein.report.Report;

public interface ReportRepository {
  void create(
      String reported,
      String server,
      String reason,
      String reportedBy
  );

  void delete(String name);

  void change(
      String name,
      String server
  );

  Report find(String name);
}
