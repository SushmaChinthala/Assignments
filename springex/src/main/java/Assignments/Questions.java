package Assignments;

import java.util.Map;

/**
 * TODO suschint This type ...
 *
 */
public class Questions {
  int questionId;

  String Question;

  // String[] solution;
  // Set<String> solution;
  Map<Integer, String> solution;

  /**
   * @return solution
   */
  public Map<Integer, String> getSolution() {

    return this.solution;
  }

  /**
   * @param solution new value of {@link #getsolution}.
   */
  public void setSolution(Map<Integer, String> solution) {

    this.solution = solution;
  }

  /*
   * @Override public boolean equals(Object obj) {
   *
   * // TODO Auto-generated method stub return super.equals(obj); }
   *
   *//**
      * @return questionId
      */

  public int getQuestionId() {

    return this.questionId;
  }

  /**
   * @param questionId new value of {@link #getquestionId}.
   */

  public void setQuestionId(int questionId) {

    this.questionId = questionId;
  }

  /**
   * @return question
   */

  public String getQuestion() {

    return this.Question;
  }

  /**
   * @param question new value of {@link #getquestion}.
   */

  public void setQuestion(String question) {

    this.Question = question;
  }

  /**
   * @return solution
   */

  /**
   * @return solution
   */
  /*
   * public Set<String> getSolution() {
   *
   * return this.solution; }
   *
   *//**
      * @param solution new value of {@link #getsolution}.
      */

  /*
   * public void setSolution(Set<String> solution) {
   *
   * this.solution = solution; }
   */
  /*
   * public String[] getSolution() {
   *
   * return this.solution = this.solution; }
   *
   *//**
      * @param solution new value of {@link #getsolution}.
      *//*
         * public void setSolution(String[] solution) {
         *
         * this.solution = solution; }
         *
         * @Override public String toString() {
         *
         * // TODO Auto-generated method stub return super.toString(); }
         */
  public void display() {

    System.out.println("questionId is:" + getQuestionId());
    System.out.println("question is:" + getQuestion());
    /*
     * for (int i = 0; i < this.solution.length(); i++) { System.out.println(solution[i]); }
     */
    System.out.println(getSolution());
  }
}

/**
 * @return answers
 */
