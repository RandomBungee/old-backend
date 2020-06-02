package com.gitlab.leonklein.report;

import java.util.Optional;

public interface ReportRepository {
  void create(Report report);

  void delete(String name);

  void change(Report report);

  Optional<Report> find(String name);
}
