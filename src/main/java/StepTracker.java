import java.util.ArrayList;
public class StepTracker
{
 private int goal;
 private int steps = 0;
 private int actDays = 0;
 private int days = 0;
 
 public StepTracker(int num){
  goal = num;
 }

 public void addDailySteps(int addedSteps){
  steps += addedSteps;
  days++;
 }

 public int activeDays(){
  if (steps >= goal){
   actDays += 1;
  }
  return actDays;
 }

 public double averageSteps(){
  return (double)steps/(double)days;
 }
} 
