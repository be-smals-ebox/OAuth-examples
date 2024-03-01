package be.smals.ebox.poc.oauth;

public abstract class POC_CONFIG {
    public static POC_CONFIG inst;

    public abstract String getOauth2V5Endpoint();
    public abstract String getAudience();
    public String getOauth2V5TokenEndpoint(){
        return getOauth2V5Endpoint()+"/token";
    }
    public abstract OauthConfig getClientConfig() ;
}
