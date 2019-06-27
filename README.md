## Spring Boot-ifying a GWT app

This is one of the simple sample apps from the GWT SDK
converted to a Spring Boot application.

Note that, as a result of eliminating Jetty, the
`gwt:devmode` command will no longer work. However,
the application war-file becomes an executable Spring
Boot application that can be run in the usual way.