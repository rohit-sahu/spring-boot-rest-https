# spring-boot-rest-https
Spring boot with Restful Example and Https Protocol Enabled

### Generating a Self-Signed Certificate
Before getting started, we’ll create a self-signed certificate. We’ll use either of the following certificate formats:

* PKCS12 : 
Public Key Cryptographic Standards is a password protected format that can contain multiple certificates and keys; it’s an industry-wide used format
* JKS : 
Java KeyStore is similar to PKCS12; it’s a proprietary format and is limited to the Java environment.
We can use either of keytool or [OpenSSL] tools to generate the certificates from the command line. [Keytool] is shipped with Java Runtime Environment and OpenSSL could be downloaded from [OpenSSL].

Let’s use keytool for our demonstration.

### Generating a Keystore
- Now we’ll create a set of cryptographic keys and store it in a keystore.

> We can use the following command to generate our PKCS12 keystore format:
  ```sh
  keytool -genkeypair -alias rohit -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore rohit.p12 -validity 3650
  ```
  We can store as many numbers of key-pair in the same keystore each identified by a unique alias.

> For generating our keystore in a JKS format, we can use the following command:
  ```sh
  keytool -genkeypair -alias rohit -keyalg RSA -keysize 2048 -keystore rohit.jks -validity 3650
  ```

> It is recommended to use the PKCS12 format which is an industry standard format. So in case we already have a JKS keystore, we can         convert it to PKCS12 format using the following command:
  ```sh
  keytool -importkeystore -srckeystore rohit.jks -destkeystore rohit.p12 -deststoretype pkcs12
  ```

**Thanks**

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

[Keytool]: <https://docs.oracle.com/javase/6/docs/technotes/tools/solaris/keytool.html>
[OpenSSL]: <https://www.openssl.org/>
