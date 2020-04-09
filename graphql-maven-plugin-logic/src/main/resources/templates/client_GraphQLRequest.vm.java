package ${packageUtilName};

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.graphql_java_generator.annotation.RequestType;
import com.graphql_java_generator.client.GraphqlClientUtils;
import com.graphql_java_generator.client.request.InputParameter;
import com.graphql_java_generator.client.request.ObjectResponse;
import com.graphql_java_generator.client.request.QueryField;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class GraphQLRequest extends ObjectResponse {

	/** Logger for this class */
	private static Logger logger = LoggerFactory.getLogger(GraphQLRequest.class);

	final GraphqlClientUtils graphqlClientUtils = new GraphqlClientUtils();

	// This initialization must occur before the execution of the constructors, in order to properly parse the GraphQL request
	static {
		CustomScalarRegistryInitializer.initCustomScalarRegistry();
		DirectiveRegistryInitializer.initDirectiveRegistry();
	}

	/** {@inheritDoc} */
	public GraphQLRequest(String graphQLRequest) throws GraphQLRequestPreparationException {
		super(graphQLRequest);
	}
	
	/** {@inheritDoc} */
	public GraphQLRequest(String graphQLRequest, RequestType requestType, String queryName,
			InputParameter... inputParams) throws GraphQLRequestPreparationException {
		super(graphQLRequest, requestType, queryName, inputParams);
	}

#if ($query)
	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = myQueryType.getResponseBuilder()
	 * 			.withQueryResponseDef("query{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * Map<String, Object> params = new HashMap<>();
	 * params.put("heroParam", heroParamValue);
	 * params.put("skip", Boolean.FALSE);
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${query.name}Response response = request.exec(params);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${query.name}Response execQuery(Map<String, Object> parameters) throws GraphQLRequestExecutionException {
		logExecution(RequestType.mutation, parameters);
		return exec(${query.name}Response.class, parameters);
	}

	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = new GraphQLRequest("query{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${query.name}Response response = request.exec("heroParam", heroParamValue, "skip", Boolean.FALSE);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${query.name}Response execQuery(Object... paramsAndValues) throws GraphQLRequestExecutionException {
		return exec(${query.name}Response.class, graphqlClientUtils.generatesBindVariableValuesMap(paramsAndValues));
	}

#end
#if ($mutation)
	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = myQueryType.getResponseBuilder()
	 * 			.withQueryResponseDef("mutation{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * Map<String, Object> params = new HashMap<>();
	 * params.put("heroParam", heroParamValue);
	 * params.put("skip", Boolean.FALSE);
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${mutation.name}Response response = request.exec(params);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${mutation.name}Response execMutation(Map<String, Object> parameters)
			throws GraphQLRequestExecutionException {
		logExecution(RequestType.mutation, parameters);
		return exec(${mutation.name}Response.class, parameters);
	}

	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = new GraphQLRequest("mutation{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${mutation.name}Response response = request.exec("heroParam", heroParamValue, "skip", Boolean.FALSE);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${mutation.name}Response execMutation(Object... paramsAndValues) throws GraphQLRequestExecutionException {
		return exec(${mutation.name}Response.class, graphqlClientUtils.generatesBindVariableValuesMap(paramsAndValues));
	}

#end
#if ($subscription)
	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = myQueryType.getResponseBuilder()
	 * 			.withQueryResponseDef("subscription{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * Map<String, Object> params = new HashMap<>();
	 * params.put("heroParam", heroParamValue);
	 * params.put("skip", Boolean.FALSE);
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${subscription.name}Response response = request.exec(params);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${subscription.name}Response execSubscription(Map<String, Object> parameters)
			throws GraphQLRequestExecutionException {
		throw new GraphQLRequestExecutionException("Subscriptions are not managed yet");
	}

	/**
	 * This method executes the current GraphQL request as a query request.is expected by the graphql-java framework. It
	 * will be called when this query is called. It offers a logging of the call (if in debug mode), or of the call and
	 * its parameters (if in trace mode).<BR/>
	 * Here is a sample (and please have a look to the GraphQL site for more information):
	 * 
	 * <PRE>
	 * GraphQLRequest request;
	 * 
	 * public void setup() {
	 *  GraphQLRequest.setStaticConfiguration(...);
	 * 	// Preparation of the query
	 * 	request = new GraphQLRequest("subscription{hero(param:?heroParam) @include(if:true) {id name @skip(if: ?skip) appearsIn friends {id name}}}").build();
	 * }
	 * 
	 * public void doTheJob() {
	 * ..
	 * // This will set the value sinceValue to the sinceParam field parameter
	 * ${subscription.name}Response response = request.exec("heroParam", heroParamValue, "skip", Boolean.FALSE);
	 * ...
	 * }
	 * </PRE>
	 * 
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	public ${subscription.name}Response execSubscription(Object... paramsAndValues) throws GraphQLRequestExecutionException {
		throw new GraphQLRequestExecutionException("Subscriptions are not managed yet");
	}

#end
	/**
	 * 
	 * @param executionOf
	 *            A string
	 * @param parameters
	 */
	private void logExecution(RequestType requestType, Map<String, Object> parameters) {
		if (logger.isTraceEnabled()) {
			if (parameters == null) {
				logger.trace("Executing of " + requestType.toString() + " without parameters");
			} else {
				StringBuffer sb = new StringBuffer("Executing of root mutation with parameters: ");
				boolean addComma = false;
				for (String key : parameters.keySet()) {
					sb.append(key).append(":").append(parameters.get(key));
					if (addComma)
						sb.append(", ");
					addComma = true;
				}
				logger.trace(sb.toString());
			}
		} else if (logger.isDebugEnabled()) {
			logger.debug("Executing of mutation 'MutationType'");
		}
	}

	@Override
	public QueryField getQueryContext() throws GraphQLRequestPreparationException {
#if ($query)
		return new QueryField(${query.name}RootResponse.class, "query");
#else
		// No query in this GraphQL schema
		return null;
#end
	}

	@Override
	public QueryField getMutationContext() throws GraphQLRequestPreparationException {
#if ($mutation)
		return new QueryField(${mutation.name}RootResponse.class, "mutation");
#else
		// No mutation in this GraphQL schema
		return null;
#end
	}

	@Override
	public QueryField getSubscriptionContext() throws GraphQLRequestPreparationException {
		throw new GraphQLRequestPreparationException("Subscriptions are not managed yet");
	}

}
