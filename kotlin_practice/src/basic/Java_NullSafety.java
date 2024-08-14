package basic;

import java.util.Optional;

public class Java_NullSafety {

    public static String getNullStr() {
        return null;
    }

    public static int getLengthIfNotNull(String str){
        if(str == null || str.length() == 0){
            return 0;
        }
        return str.length();
    }

    public static void main(String[] args) {
        String nullableStr = getNullStr();

        // Optional 사용
//        nullableStr = Optional.ofNullable(nullableStr)
//                .orElse("null일 경우 반환");

        // null 참조를 사용해도 컴파일 오류가 발생하지 않음
        int nullableStrLength = nullableStr.length();
        System.out.println(nullableStrLength);

        // 매서드 내부에서 null 검사하는 방법도 있음
        int length = getLengthIfNotNull(null);
        System.out.println(length);
    }
}
