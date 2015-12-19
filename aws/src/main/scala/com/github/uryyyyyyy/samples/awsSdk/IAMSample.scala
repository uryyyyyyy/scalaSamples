//package com.github.uryyyyyyy.aws.scala
//
//import awscala._
//import awscala.iam._
//import com.amazonaws.services.identitymanagement.model.{AttachGroupPolicyRequest, CreatePolicyRequest}
//
//object IAMSample {
//
//	def main(args: Array[String]): Unit = {
//		implicit val iam = IAM()
//
//		val group = iam.createGroup("AdminGroup")
//
//		val result = iam.createPolicy(new CreatePolicyRequest()
//			.withPolicyName("AdminPolicy")
//			.withPath("/path/")
//			.withDescription("can access all action")
//			.withPolicyDocument(Policy(Seq(Statement(Effect.Allow, Seq(Action("*")), Seq(Resource("*"))))).asJSON)
//		)
//
//		iam.attachGroupPolicy(new AttachGroupPolicyRequest()
//			.withGroupName(group.name)
//			.withPolicyArn(result.getPolicy.getArn)
//		)
//
//
//		val user: User = iam.createUser("admin2")
//		user.setLoginPassword("6HIo[}rV")
//		group.add(user)
//	}
//
//}
