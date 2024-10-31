package com.zero.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZeroGroovyBootApplicationTests {

    @Test
    void test() {
        Binding groovyBinding = new Binding();
        groovyBinding.setVariable("testService", new ZeroGroovyBootApplicationTests());
        GroovyShell groovyShell = new GroovyShell(groovyBinding);

        String scriptContent = "import com.zero.groovy.ZeroGroovyBootApplicationTests \n" +
                "def query = new ZeroGroovyBootApplicationTests().testQuery(1L); \n" +
                "query";

//        String scriptContent = "def query = testService.testQuery(2L);\n" + "query";

        Script script = groovyShell.parse(scriptContent);
        System.out.println(script.run());
    }

    public String testQuery(long id){
        return "Test query success, id is " + id;
    }

}
