package io.github.adorableskullmaster.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.domains.subdomains.MWar;

import java.util.List;

public class War extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("war")
  @Expose
  private List<MWar> war = null;

  public boolean isSuccess() {
    return success;
  }

  public List<MWar> getWar() {
    return war;
  }
}