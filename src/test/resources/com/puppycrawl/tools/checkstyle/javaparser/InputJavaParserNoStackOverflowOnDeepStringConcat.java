package com.puppycrawl.tools.checkstyle.javaparser;

public class InputJavaParserNoStackOverflowOnDeepStringConcat {
    public static final String X =

"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+

"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+

"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+

"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+

"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+
"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+"a"+

        "b";
}
