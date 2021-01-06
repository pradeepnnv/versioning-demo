Reference [https://github.com/kalaspuffar/VersioningDemo]

# versioning-demo
Versioning Demo - Maven Release

### Build the maven package
```
mvn clean package
```

### Test
```
java -jar target/mvn-version-demo-*-SNAPSHOT-jar-with-dependencies.jar
```

### Maven Release start
```
mvn jgitflow:release-start -DpushReleases=true -DreleaseVersion=1.3 -DdevelopmentVersion=1.3
```

### Maven Release finish
```
mvn release:perform
```
