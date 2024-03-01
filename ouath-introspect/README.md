# Performing introspect as Document Provider
This project contains some java examples for Document Providers to perform get token requests to the Smals OAuth server.

This example does the following:
- Get a token for a Document Consumer with the documentconsumer scope
- Get a token for the Document Provider with the introspect scope
- Perform the introspect of the Document Consumer token using the Document Provider

## What you need
To perform this test you will need one or two keystores (in the form of .p12 or .jks files) that can have the aforementioned scopes. 
Typically you would have
- One keystore for the Document Consumer
- One keystore for the Document Provider

## Preparation
The placeholders in the [src/main/java/be/smals/ebox/poc/oauth/instropsect/LAUNCHER.java](LAUNCHER.java) need to be filled with the value matching the identities of the Document Provider and Document Consumer
