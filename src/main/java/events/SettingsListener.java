package events;
/**
 * Created by Doston Hamrakulov
 */

/**
 * Listener interface for receiving a notification when settings have changed.
 */
public interface SettingsListener {

    /**
     * Called when the settings have changed.
     */
    void settingsChanged();

}
