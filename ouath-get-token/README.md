# Get an OAuth token as a Document Sender
This project is an example to request an OAuth token to the Smals OAuth token with the scope needed to publish messages to e-Box.

## What you need
To perform this test you will need an identity (a keystore in the form of .p12 or .jks file) that can have the aforementioned scope.

## Preparation
The placeholders in the [src/main/java/be/smals/ebox/poc/oauth/docsender/LAUNCHER.java](LAUNCHER.java) need to be filled with the value matching the identities of the Document Sender OAuth client.
