FROM berlinguyinca/jboss4

COPY target/org.springframework.samples.petclinic-1.0.0-SNAPSHOT.war /opt/jboss/jboss-4.2.3.GA/server/default/deploy/petclinic.war
