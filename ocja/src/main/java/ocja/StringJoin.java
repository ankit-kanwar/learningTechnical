package ocja;

public class StringJoin {

	public static void main(String[] args) {
        var res = ""; //Line n1
        String [] arr = {"1", "2", "3"};
        for(var s : arr) { //Line n2
            res += String.join(".", s); //Line n3
        }
        System.out.println(res); //Line n4
    }
	
	/*
	 * 1. public static String join(CharSequence delimiter, CharSequence...
	 * elements) {...}: It returns a new String composed of copies of the
	 * CharSequence elements joined together with a copy of the specified delimiter.
	 * 
	 * For example,
	 * 
	 * String.join(".", "A", "B", "C"); returns "A.B.C"
	 * 
	 * String.join("+", new String[]{"1", "2", "3"}); returns "1+2+3"
	 * 
	 * String.join("-", "HELLO"); returns "HELLO"
	 * 
	 * 
	 * 
	 * If delimiter is null or elements refer to null, then NullPointerException is
	 * thrown. e.g.,
	 * 
	 * String.join(null, "A", "B"); throws NullPointerException
	 * 
	 * String [] arr = null; String.join("-", arr); throws NullPointerException
	 * 
	 * 
	 * 
	 * But if single element is null, then "null" is considered. e.g.,
	 * 
	 * String str = null; String.join("-", str); returns "null"
	 * 
	 * String.join("::", new String[] {"James", null, "Gosling"}); returns
	 * "James::null::Gosling"
	 * 
	 * 
	 * 
	 * 2. public static String join​(CharSequence delimiter, Iterable<? extends
	 * CharSequence> elements) {...}: It returns a new String composed of copies of
	 * the CharSequence elements joined together with a copy of the specified
	 * delimiter.
	 * 
	 * For example,
	 * 
	 * String.join(".", List.of("A", "B", "C")); returns "A.B.C"
	 * 
	 * String.join(".", List.of("HELLO")); returns "HELLO"
	 * 
	 * 
	 * 
	 * If delimiter is null or elements refer to null, then NullPointerException is
	 * thrown. e.g.,
	 * 
	 * String.join(null, List.of("HELLO")); throws NullPointerException
	 * 
	 * List<String> list = null; String.join("-", list); throws NullPointerException
	 * 
	 * 
	 * 
	 * But if single element is null, then "null" is considered. e.g.,
	 * 
	 * List<String> list = new ArrayList<>(); list.add("A"); list.add(null);
	 * String.join("::", list); returns "A::null"
	 * 
	 * Please note: String.join("-", null); causes compilation error as compiler is
	 * unable to tag this call to specific join(...) method. It is an ambiguous
	 * call.
	 * 
	 * 
	 * 
	 * Let's check the iterations:
	 * 
	 * 1st iteration: s refers to "1". `String.join(".", s)` returns "1" and res =
	 * "" + "1" = "1".
	 * 
	 * 2nd iteration: s refers to "2". `String.join(".", s)` returns "2" and res =
	 * "1" + "2" = "12".
	 * 
	 * 3rd iteration: s refers to "3". `String.join(".", s)` returns "3" and res =
	 * "12" + "3" = "123".
	 * 
	 * Loop finishes its execution and Line n4 prints 123 on to the console.
	 */

}
