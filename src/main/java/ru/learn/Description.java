
package ru.learn;

import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("participantInn")
    private String mParticipantInn;

    public Description(String participantInn) {
        this.mParticipantInn = participantInn;
    }

    public String getParticipantInn() {
        return mParticipantInn;
    }

    public void setParticipantInn(String participantInn) {
        mParticipantInn = participantInn;
    }

}
