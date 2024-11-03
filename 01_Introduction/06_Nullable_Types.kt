fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    // The only if statement we use
    if (client == null || message == null) return;

    // Using elvis operator to replace ifs
    val personalInfo = client.personalInfo ?: return;
    val email = personalInfo.email ?: return;

    mailer.sendMessage(email, message);

}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
