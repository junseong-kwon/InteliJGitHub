package cond.Ex;

public class Ex1 {
    public static void main(String[] args) {
        int score = 70;

        if(score >= 90) {
            System.out.println("학점은 A입니다.");
        }


        else if (score < 90){
                System.out.println("B");
            }

            else if (score < 80){
                System.out.println("C");

            }
            else if (score < 70) {
                System.out.println("학점은 D입니다.");
            }

            else {
                System.out.println("E");
            }

        }
    }
