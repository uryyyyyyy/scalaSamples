import mail.MailSender

object MailMain {
  def main(args: Array[String]): Unit = {
	  MailSender.sendMail()
  }
}
