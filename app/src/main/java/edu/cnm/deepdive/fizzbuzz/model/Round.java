package edu.cnm.deepdive.fizzbuzz.model;

import androidx.annotation.NonNull;
import java.io.Serializable;

public class Round implements Serializable {


  public static final String FORMAT_STRING = "%1$d (%2$s); selection: %3$s";
  private static final long serialVersionUID = 4180175544896581305L;
  private final int value;
  private final Category category;
  private final Category selection;
  // TODO record time for selection.


  public Round(int value, Category category, Category selection) {
    this.value = value;
    this.category = category;
    this.selection = selection;
  }

  @NonNull
  @Override
  public String toString() {
    return String.format(FORMAT_STRING, value, category, selection);
  }

  public int getValue() {
    return value;
  }

  public Category getCategory() {
    return category;
  }

  public Category getSelection() {
    return selection;
  }

  public boolean isCorrect() {
    return selection == category;
  }

  public enum Category {
    FIZZ, BUZZ, FIZZBUZZ, NEITHER;

    public static Category fromValue(int value) {
      Category category = null;
      if (FizzBuzz.isFizz(value)){
        if (FizzBuzz.isBuzz(value)) {
          category = FIZZBUZZ;
        } else {
          category = FIZZ;
        }
      } else if ( FizzBuzz. isBuzz(value)) {
        category = BUZZ;
      } else {
        category = NEITHER;
      }
      return category;
    }

    @Override
    public String toString() {
      return super.toString().toLowerCase();
    }
  }

}
