package ${packageUtilName};

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

#foreach($import in $imports)
import $import;
#end

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class ${objectName} {

	public static final String NAME = "${query.javaName}";

#if ($query.list  &&  $query.type.class.simpleName == "InterfaceType")
	@JsonDeserialize(contentAs = ${query.type.concreteClassSimpleName}.class)
#elseif (${query.list})
	@JsonDeserialize(contentAs = ${query.type.classSimpleName}.class)
#elseif ($query.type.class.simpleName == "InterfaceType")
	@JsonDeserialize(as = ${query.type.concreteClassSimpleName}.class)
#end
	@JsonProperty("${query.name}")
	#if(${query.list})List<#end${query.type.classSimpleName}#if(${query.list})>#end ${query.javaName};

	public void set${query.pascalCaseName}(#if(${query.list})List<#end${query.type.classSimpleName}#if(${query.list})>#end ${query.javaName}) {
		this.${query.javaName} = ${query.javaName};
	}

	public #if(${query.list})List<#end${query.type.classSimpleName}#if(${query.list})>#end get${query.pascalCaseName}() {
		return ${query.javaName};
	}
	
    public String toString() {
        return "${queryName} {${query.name}: " + ${query.javaName} + "}";
    }
}
