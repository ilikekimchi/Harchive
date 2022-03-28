# Harchive

##DB연결정보 - root-context.xml
  <bean id="dataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
      <property name="driverClassName" value="com.mysql.jdbc.Driver" />
      <property name="url" value="jdbc:mysql://127.0.0.1:3306/h_archive" />   
      <property name="username" value="root" />
      <property name="password" value="1234" />
   	</bean>
