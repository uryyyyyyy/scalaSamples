package com.github.uryyyyyyy.samples.mail

import org.apache.commons.mail.SimpleEmail

object MailSender {

	def sendMail() {
		new SimpleEmail {
			setCharset("UTF-8")
			setHostName("smtpHost")
			setFrom("sample@gmail.com")
			addTo("sample@gmail.com")
			setSubject("subject")
			setMsg("mail content")
		}.send
	}
}