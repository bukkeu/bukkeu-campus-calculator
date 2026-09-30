package com.bukkue.campus;

public class DuesCalculator {

    public int getShare(int total, int people) {
        return (total / people);
    } // 몫을 돌려줌

    // 총비용 : total
    // 인원 : people

    public int getRemainder(int total, int people) {
        return(total % people);

    } // 나머지를 돌려줌
}
