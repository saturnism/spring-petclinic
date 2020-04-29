FROM berlinguyinca/jboss4

COPY target/petclinic.war /opt/jboss/jboss-4.2.3.GA/server/default/deploy/petclinic.war
