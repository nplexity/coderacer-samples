/*BluetoothVisibilityTImeoutFragment.java*/
/*Android*/
/*https://github.com/CyanogenMod/android_packages_apps_Settings/blob/cm-11.0/src/com/android/settings/bluetooth/BluetoothVisibilityTimeoutFragment.java*/

public final class BluetoothVisibilityTimeoutFragment extends DialogFragment
        implements DialogInterface.OnClickListener {

    private final BluetoothDiscoverableEnabler mDiscoverableEnabler;

    public BluetoothVisibilityTimeoutFragment() {
        mDiscoverableEnabler = LocalBluetoothManager.getInstance(getActivity())
                .getDiscoverableEnabler();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.bluetooth_visibility_timeout)
                .setSingleChoiceItems(R.array.bluetooth_visibility_timeout_entries,
                        mDiscoverableEnabler.getDiscoverableTimeoutIndex(), this)
                .setNegativeButton(android.R.string.cancel, null)
                .create();
    }

    public void onClick(DialogInterface dialog, int which) {
        mDiscoverableEnabler.setDiscoverableTimeout(which);
        dismiss();
    }
}
