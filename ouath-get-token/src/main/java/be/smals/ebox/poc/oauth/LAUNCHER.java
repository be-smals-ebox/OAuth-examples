package be.smals.ebox.poc.oauth;

public class LAUNCHER {
    public static void main(String[] args) {
        POC_CONFIG.inst=new POC_CONFIG(){

            @Override
            public String getOauth2V5Endpoint() {
                return "https://services-acpt.socialsecurity.be/REST/oauth/v5";
            }

            @Override
            public String getAudience() {
                return "https://services-acpt.socialsecurity.be/REST/oauth/v5/token";
            }

            @Override
            public OauthConfig getClientConfig() {
                /*
                 * The Keystore configuration and the client ID given by eBoxIntegration after an OAuth onboarding.
                 */
                return new OauthConfig()
                        .setKeyFileLocation("/Users/jabu/Downloads/keystores/ebox-ws-acc.jks")//.setKeyFileLocation("<classpath location of the keystore file>") // e.g. /jks/documentmanagement_publication_ebox.p12
                        .setPassword("pgpperso00")//.setPassword("<keystore password>")
                        .setAlias("eboxws")//.setAlias("<alias in the keystore>") // e.g. documentmanagement:publication:ebox
                        .setAliasPassword("pgpperso00")//.setAliasPassword("<alias password>")
                        .setClientId("documentmanagement:publication:ebox:client");//.setClientId("<oauth client ID>"); // e.g. documentmanagement:publication:ebox:client
            }
        };

        /* You can put zero, one or several token as parameters for getAccessToken method.
        If no scope is requested, the token contains all scopes that the client is granted.*/

        // Get token and get all granted scopes.
        String accessToken = new GetAccessTokenV5().getAccessToken(POC_CONFIG.inst.getClientConfig());

        // Get token for Document Consumer (used to consult messages via an application)
        /*String accessToken = new GetAccessTokenV5().getAccessToken(POC_CONFIG.inst.getClientConfig(),
                "scope:document:management:consult:ws-eboxrestentreprise:documentconsumer"
        );*/

        // Get token for Document Sender (used to send messages)
        /*String accessToken = new GetAccessTokenV5().getAccessToken(POC_CONFIG.inst.getClientConfig(),
                "scope:document:management:consult:ws-eboxrestentreprise:publicationsender"
        );*/

        // Get token for Document Sender + ebox preference (used to check recipient ebox validity or activity then send messages)
        /*String accessToken = new GetAccessTokenV5().getAccessToken(POC_CONFIG.inst.getClientConfig(),
                "scope:document:management:consult:ws-eboxrestentreprise:publicationsender",
                "scope:documentmanagement:ebox:enterprise:federation-rest:preference"
                );
        */

        System.out.println("Client token: " + accessToken);
    }
}
