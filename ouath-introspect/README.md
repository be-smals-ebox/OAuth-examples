# Performing introspect as Document Provider
This project contains some java examples for Document Providers to perform get token requests to the Smals OAuth server.

This example does the following:
- Get a token for a Document Consumer with the documentconsumer scope
- Get a token for the Document Provider with the introspect scope
- Perform the introspect of the Document Consumer token using the Document Provider

## What you need
To perform this test you will need one or two identities (in the form of .p12 files) that can have the aforementioned scopes. 
Typically you would have
- One .p12 for the Document Consumer
- One .p12 for the Document Provider

## Preparation
The .p12 files need to be placed in the class path (i.e the [src/main/resources]() folder). The placeholders in the [src/main/java/be/smals/ebox/poc/oauth/instropsect/LAUNCHER.java](LAUNCHER.java) need to be filled with the value matching the identities of the Document Provider and Document Consumer
