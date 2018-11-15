package io.github.adorableskullmaster.pw4j.queries;

import io.github.adorableskullmaster.pw4j.domains.Alliance;
import io.github.adorableskullmaster.pw4j.enums.QueryURL;

public class AllianceQuery implements IEntityQuery {

  private int aid;

  public AllianceQuery(int aid) {
    this.aid = aid;
  }

  @Override
  public ApiQuery build() {
    String url = QueryURL.ALLIANCE_URL.getUrl().concat("id=").concat(Integer.toString(aid));
    return new ApiQuery<>(url, new Alliance());
  }
}