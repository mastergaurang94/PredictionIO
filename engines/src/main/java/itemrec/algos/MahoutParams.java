package io.prediction.engines.java.itemrec.algos;

import io.prediction.controller.java.JavaParams;
import io.prediction.controller.Params;

//public class MahoutParams implements JavaParams {
public class MahoutParams implements Params {
  public int numRecommendations;
  public MahoutParams(int numRecommendations) {
    this.numRecommendations = numRecommendations;
  }
}