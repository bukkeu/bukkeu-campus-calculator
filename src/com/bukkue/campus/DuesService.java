package com.bukkue.campus;

public class DuesService {

    public void printSettlement(int total, int people) {

        if (total <= 0 || people <= 0) {
            System.out.println("총비용과 인원은 1 이상이어야 합니다.");
            return;
        }

        DuesCalculator duesc = new DuesCalculator();
        int x = duesc.getShare(total,people);
        int y = duesc.getRemainder(total,people);

        if (y > 0){
            System.out.println("일인당" +x+ "원 (남는 " +y+ "원은 총무가 더 냅니다.)");
        }

        for (int i = 1; i <= people; i++) {
            String s = getMemberLine(i,x,y);
            System.out.println(s);
        }

    }


    public String getMemberLine(int number, int share, int remainder) {
        if (remainder != 0 && number == 1) {
            return (number + "번 (총무) : "  + (share+remainder) + "원");
        } else if (number == 1) {
            return (number + "번 (총무) : "  + (share+remainder) + "원");
        } else{
            return (number + "번 : "  + share + "원");
        }

    }
}
