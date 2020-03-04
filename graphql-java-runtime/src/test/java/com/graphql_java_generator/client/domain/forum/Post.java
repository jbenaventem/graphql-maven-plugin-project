package com.graphql_java_generator.client.domain.forum;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class Post  {

	@JsonProperty("id")
	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	String id;


	@JsonProperty("date")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String date;


	@JsonProperty("author")
	@GraphQLNonScalar(graphQLTypeName = "Member", javaClass = Member.class)
	Member author;


	@JsonProperty("publiclyAvailable")
	@GraphQLScalar(graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean publiclyAvailable;


	@JsonProperty("title")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String title;


	@JsonProperty("content")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String content;


	@JsonProperty("__typename")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String __typename;



	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setAuthor(Member author) {
		this.author = author;
	}

	public Member getAuthor() {
		return author;
	}

	public void setPubliclyAvailable(Boolean publiclyAvailable) {
		this.publiclyAvailable = publiclyAvailable;
	}

	public Boolean getPubliclyAvailable() {
		return publiclyAvailable;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	public String get__typename() {
		return __typename;
	}

    public String toString() {
        return "Post {"
				+ "id: " + id
				+ ", "
				+ "date: " + date
				+ ", "
				+ "author: " + author
				+ ", "
				+ "publiclyAvailable: " + publiclyAvailable
				+ ", "
				+ "title: " + title
				+ ", "
				+ "content: " + content
				+ ", "
				+ "__typename: " + __typename
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field {
		Id("id"),
		Date("date"),
		Author("author"),
		PubliclyAvailable("publiclyAvailable"),
		Title("title"),
		Content("content"),
		__typename("__typename");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

	}
}
