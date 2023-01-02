package com.example.RESTAPI.RESTAPIDEMO.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController
{
@GetMapping("/v1/person")
public PersonV1 getVersionOfPerson()
{
	return new PersonV1("Bob Charlie");
}
@GetMapping("/v2/person")
public PersonV2 getSecondVersionOfPerson()
{
	return new PersonV2(new Name("Bob", "Charlie"));
}
@GetMapping(path="/person",params="version=1")
public PersonV1 getVersionOfPersonRequestParameter()
{
	return new PersonV1("Bob Charlie");
}
@GetMapping(path="/person",params="version=2")
public PersonV2 getsrecondpersonVersionOfPersonRequestParameter2()
{
	return new PersonV2(new Name("Bob"," Charlie"));
}
@GetMapping(path="/person/header",headers="X-API-VERSION=1")
public PersonV1 getVersionOfPerson1RequestHeader()
{
	return new PersonV1("Bob Charlie");
}
@GetMapping(path="/person/header",headers="X-API-VERSION=2")
public PersonV2 getVersionOfPerson2RequestHeader()
{
	return new PersonV2(new Name("Bob ","Charlie"));
}


}
