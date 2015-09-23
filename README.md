Alfresco: OpenOffice Temp Filename Shortener
============================================
When using Alfresco on a **Windows** platform, Alfresco temporal path can exceed easily Windows maximum path length.

*C:\Alfresco\apache-tomcat\temp\Alfresco\LargeFilenameToIncludeOnTransformation.docx-OpenOfficeContentTransformer-OpenOfficeContentTransformer-1442998872585\LargeFilenameToIncludeOnTransformation.docx-OpenOfficeContentTransformer-target-5667410859729336016.pdf*

This addon provides an Alfresco Repo extension for OOoDirect subsystem which uses **OOCT** temporal prefix instead of Alfresco default **OpenOfficeContentTransformer**. So, about 77 additional characters are available for filenames in Alfresco.

*C:\Alfresco\apache-tomcat\temp\Alfresco\LargeFilenameToIncludeOnTransformation.docx-OOCT-OOCT-1442998872585\LargeFilenameToIncludeOnTransformation.docx-OOCT-target-5667410859729336016.pdf*

This addon should not be used on Linux platforms.

The plugin is licensed under the [LGPL v3.0](http://www.gnu.org/licenses/lgpl-3.0.html). The current version is 1.0.0, which is compatible with Alfresco 4.2.c-f and 5.0.a-d.

Downloading the ready-to-deploy-plugin
--------------------------------------
The binary distribution is made of two amp files:

* [repo AMP](https://github.com/keensoft/alfresco-firma-pdf/releases/download/0.9.0/sign-document-0.9.0.amp)

You can install them by using standard [Alfresco deployment tools](http://docs.alfresco.com/community/tasks/dev-extensions-tutorials-simple-module-install-amp.html)

Building the artifacts
----------------------
If you are new to Alfresco and the Alfresco Maven SDK, you should start by reading [Jeff Potts' tutorial on the subject](http://ecmarchitect.com/alfresco-developer-series-tutorials/maven-sdk/tutorial/tutorial.html).

You can build the artifacts from source code using maven
```$ mvn clean package```
