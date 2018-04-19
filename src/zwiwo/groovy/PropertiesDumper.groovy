package zwiwo.groovy

import org.apache.tools.ant.Project
import org.apache.tools.ant.Task

class PropertiesDumper extends Task {
String nameMatch
String valueMatch
File file

    public void execute() {
        Project proj = this.getProject()

        def matchingProperties = proj.properties.findAll {
            name, value -> (name =~ nameMatch ) || (value =~ valueMatch)
        }
        def writeProperties = {out -> matchingProperties.each {
            name, value -> out.println("$name = $value")
        }}

        file ? file.withPrintWriter(writeProperties(it)) : System.out.with{writeProperties(it)}

    }

}
