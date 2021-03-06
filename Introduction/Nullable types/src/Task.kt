fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    if(client == null || message == null) return

    var personalInfo : PersonalInfo? = client.personalInfo;
    if (personalInfo == null) return

    var email: String? = personalInfo.email ?: return

    mailer.sendMessage(email!!,message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
