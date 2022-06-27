package com.n4mbot.service.s;
//
//
//import com.google.api.gax.rpc.ApiException;

//
//
//import java.io.IOException;
//
//
public class DetectIntentTexts {
//
//    // DialogFlow API Detect Intent sample with text inputs.
//    public static String detectIntentText(
//            String projectId, String text, String sessionId, String languageCode)
//            throws IOException, ApiException {
//        QueryResult queryResult = null ;
//        // Instantiates a client
//        try (SessionsClient sessionsClient = SessionsClient.create()) {
//            // Set the session name using the sessionId (UUID) and projectID (my-project-id)
//            SessionName session = SessionName.of(projectId, sessionId);
//            System.out.println("Session Path: " + session.toString());
//            // Set the text (hello) and language code (en-US) for the query
//            TextInput.Builder textInput =
//                    TextInput.newBuilder().setText(text).setLanguageCode(languageCode);
//
//            // Build the query with the TextInput
//            QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();
//
//            // Performs the detect intent request
//            DetectIntentResponse response = sessionsClient.detectIntent(session, queryInput);
//
//            // Display the query result
//            queryResult = response.getQueryResult();
//
//            System.out.println("====================");
//            System.out.format("Query Text: '%s'\n", queryResult.getQueryText());
//            System.out.format(
//                    "Detected Intent: %s (confidence: %f)\n",
//                    queryResult.getIntent().getDisplayName(), queryResult.getIntentDetectionConfidence());
//            System.out.format(
//                    "Fulfillment Text: '%s'\n",
//                    queryResult.getFulfillmentMessagesCount() > 0
//                            ? queryResult.getFulfillmentMessages(0).getText()
//                            : "Triggered Default Fallback Intent");
//
//        }
//        String text_response = queryResult.getQueryText();
//        return text_response;
//    }
}