.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain
	./gradlew checkstyleTest

update-deps:
	./gradlew useLatestVersions

.PHONY: build