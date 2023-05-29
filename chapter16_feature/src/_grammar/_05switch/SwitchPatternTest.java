package _grammar._05switch;


public class SwitchPatternTest {
    public static void main(String[] args) {

        System.out.println(formatter(12));
        System.out.println(formatterSwitchPattern(12));


    }
    /*
    * JDK17之前
    * */
    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = "int " + i;
        } else if (o instanceof Long l) {
            formatted = "long " + l;
        } else if (o instanceof Double d) {
            formatted = "double " + d;
        } else if (o instanceof String s) {
            formatted = "String " + s;
        }
        return formatted;
    }

    /*
    * JDK17中switch的模式匹配
    * */
    //直接在 switch 上支持 Object 类型，这就等于同时支持多种类型，使用模式匹配得到具体类型，大大简化了语法量，这个功能很实用。
    static String formatterSwitchPattern(Object o) {

        String formatted = switch(o){
            case Integer i:
                yield "int " + i;
            case Long l:
                yield "long " + l;
            case Double d:
                yield "double " + d;
            case String s:
                yield "String " + s;
            default:
                yield o.toString();

        };

        return formatted;
    }
}
