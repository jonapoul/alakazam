package alakazam.android.core

import android.accounts.AccountManager
import android.app.ActivityManager
import android.app.AlarmManager
import android.app.AppOpsManager
import android.app.DownloadManager
import android.app.GameManager
import android.app.KeyguardManager
import android.app.LocaleManager
import android.app.NotificationManager
import android.app.SearchManager
import android.app.StatusBarManager
import android.app.UiModeManager
import android.app.admin.DevicePolicyManager
import android.app.appsearch.AppSearchManager
import android.app.blob.BlobStoreManager
import android.app.job.JobScheduler
import android.app.people.PeopleManager
import android.app.role.RoleManager
import android.app.usage.NetworkStatsManager
import android.app.usage.StorageStatsManager
import android.app.usage.UsageStatsManager
import android.appwidget.AppWidgetManager
import android.bluetooth.BluetoothManager
import android.companion.CompanionDeviceManager
import android.content.ClipboardManager
import android.content.Context
import android.content.RestrictionsManager
import android.content.pm.CrossProfileApps
import android.content.pm.LauncherApps
import android.content.pm.ShortcutManager
import android.content.pm.verify.domain.DomainVerificationManager
import android.hardware.ConsumerIrManager
import android.hardware.SensorManager
import android.hardware.biometrics.BiometricManager
import android.hardware.camera2.CameraManager
import android.hardware.display.DisplayManager
import android.hardware.input.InputManager
import android.hardware.usb.UsbManager
import android.location.LocationManager
import android.media.AudioManager
import android.media.MediaCommunicationManager
import android.media.MediaRouter
import android.media.metrics.MediaMetricsManager
import android.media.midi.MidiManager
import android.media.projection.MediaProjectionManager
import android.media.session.MediaSessionManager
import android.media.tv.TvInputManager
import android.media.tv.interactive.TvInteractiveAppManager
import android.net.ConnectivityDiagnosticsManager
import android.net.ConnectivityManager
import android.net.IpSecManager
import android.net.VpnManager
import android.net.nsd.NsdManager
import android.net.wifi.WifiManager
import android.net.wifi.aware.WifiAwareManager
import android.net.wifi.p2p.WifiP2pManager
import android.nfc.NfcManager
import android.os.BatteryManager
import android.os.DropBoxManager
import android.os.HardwarePropertiesManager
import android.os.PerformanceHintManager
import android.os.PowerManager
import android.os.UserManager
import android.os.Vibrator
import android.os.VibratorManager
import android.os.health.SystemHealthManager
import android.os.storage.StorageManager
import android.print.PrintManager
import android.security.FileIntegrityManager
import android.service.wallpaper.WallpaperService
import android.telecom.TelecomManager
import android.telephony.CarrierConfigManager
import android.telephony.SubscriptionManager
import android.telephony.TelephonyManager
import android.telephony.euicc.EuiccManager
import android.telephony.ims.ImsManager
import android.view.LayoutInflater
import android.view.WindowManager
import android.view.accessibility.AccessibilityManager
import android.view.accessibility.CaptioningManager
import android.view.displayhash.DisplayHashManager
import android.view.inputmethod.InputMethodManager
import android.view.textclassifier.TextClassificationManager
import android.view.textservice.TextServicesManager
import androidx.core.content.getSystemService

public val Context.accessibilityManager: AccessibilityManager get() = requireSystemService()
public val Context.accountManager: AccountManager get() = requireSystemService()
public val Context.activityManager: ActivityManager get() = requireSystemService()
public val Context.appOpsManager: AppOpsManager get() = requireSystemService()
public val Context.appSearchManager: AppSearchManager get() = requireSystemService()
public val Context.appWidgetManager: AppWidgetManager get() = requireSystemService()
public val Context.audioManager: AudioManager get() = requireSystemService()
public val Context.alarmManager: AlarmManager get() = requireSystemService()
public val Context.batteryManager: BatteryManager get() = requireSystemService()
public val Context.biometricManager: BiometricManager get() = requireSystemService()
public val Context.blobStoreManager: BlobStoreManager get() = requireSystemService()
public val Context.bluetoothManager: BluetoothManager get() = requireSystemService()
public val Context.cameraManager: CameraManager get() = requireSystemService()
public val Context.captioningManager: CaptioningManager get() = requireSystemService()
public val Context.carrierConfigManager: CarrierConfigManager get() = requireSystemService()
public val Context.clipboardManager: ClipboardManager get() = requireSystemService()
public val Context.companionDeviceManager: CompanionDeviceManager get() = requireSystemService()
public val Context.connectivityDiagnosticsManager: ConnectivityDiagnosticsManager get() = requireSystemService()
public val Context.connectivityManager: ConnectivityManager get() = requireSystemService()
public val Context.consumerIrManager: ConsumerIrManager get() = requireSystemService()
public val Context.crossProfileApps: CrossProfileApps get() = requireSystemService()
public val Context.devicePolicyManager: DevicePolicyManager get() = requireSystemService()
public val Context.displayManager: DisplayManager get() = requireSystemService()
public val Context.displayHashManager: DisplayHashManager get() = requireSystemService()
public val Context.domainVerificationManager: DomainVerificationManager get() = requireSystemService()
public val Context.downloadManager: DownloadManager get() = requireSystemService()
public val Context.dropBoxManager: DropBoxManager get() = requireSystemService()
public val Context.euiccManager: EuiccManager get() = requireSystemService()
public val Context.fileIntegrityManager: FileIntegrityManager get() = requireSystemService()
public val Context.gameManager: GameManager get() = requireSystemService()
public val Context.hardwarePropertiesManager: HardwarePropertiesManager get() = requireSystemService()
public val Context.inflater: LayoutInflater get() = requireSystemService()
public val Context.inputManager: InputManager get() = requireSystemService()
public val Context.inputMethodManager: InputMethodManager get() = requireSystemService()
public val Context.ipSecManager: IpSecManager get() = requireSystemService()
public val Context.imsManager: ImsManager get() = requireSystemService()
public val Context.jobScheduler: JobScheduler get() = requireSystemService()
public val Context.keyguardManager: KeyguardManager get() = requireSystemService()
public val Context.launcherApps: LauncherApps get() = requireSystemService()
public val Context.localeManager: LocaleManager get() = requireSystemService()
public val Context.locationManager: LocationManager get() = requireSystemService()
public val Context.mediaCommunicationManager: MediaCommunicationManager get() = requireSystemService()
public val Context.mediaMetricsManager: MediaMetricsManager get() = requireSystemService()
public val Context.mediaProjectionManager: MediaProjectionManager get() = requireSystemService()
public val Context.mediaRouter: MediaRouter get() = requireSystemService()
public val Context.mediaSessionManager: MediaSessionManager get() = requireSystemService()
public val Context.midiManager: MidiManager get() = requireSystemService()
public val Context.networkStatsManager: NetworkStatsManager get() = requireSystemService()
public val Context.nfcManager: NfcManager get() = requireSystemService()
public val Context.notificationManager: NotificationManager get() = requireSystemService()
public val Context.nsdManager: NsdManager get() = requireSystemService()
public val Context.peopleManager: PeopleManager get() = requireSystemService()
public val Context.performanceHintManager: PerformanceHintManager get() = requireSystemService()
public val Context.powerManager: PowerManager get() = requireSystemService()
public val Context.printManager: PrintManager get() = requireSystemService()
public val Context.restrictionsManager: RestrictionsManager get() = requireSystemService()
public val Context.roleManager: RoleManager get() = requireSystemService()
public val Context.searchManager: SearchManager get() = requireSystemService()
public val Context.sensorManager: SensorManager get() = requireSystemService()
public val Context.shortcutManager: ShortcutManager get() = requireSystemService()
public val Context.statusBarManager: StatusBarManager get() = requireSystemService()
public val Context.storageManager: StorageManager get() = requireSystemService()
public val Context.storageStatsManager: StorageStatsManager get() = requireSystemService()
public val Context.subscriptionManager: SubscriptionManager get() = requireSystemService()
public val Context.systemHealthManager: SystemHealthManager get() = requireSystemService()
public val Context.telecomManager: TelecomManager get() = requireSystemService()
public val Context.telephonyManager: TelephonyManager get() = requireSystemService()
public val Context.textClassificationManager: TextClassificationManager get() = requireSystemService()
public val Context.textServicesManager: TextServicesManager get() = requireSystemService()
public val Context.tvInputManager: TvInputManager get() = requireSystemService()
public val Context.TvInteractiveAppManager: TvInteractiveAppManager get() = requireSystemService()
public val Context.uiModeManager: UiModeManager get() = requireSystemService()
public val Context.usageStatsManager: UsageStatsManager get() = requireSystemService()
public val Context.usbManager: UsbManager get() = requireSystemService()
public val Context.userManager: UserManager get() = requireSystemService()
public val Context.vibrator: Vibrator get() = requireSystemService()
public val Context.vibratorManager: VibratorManager get() = requireSystemService()
public val Context.vpnManager: VpnManager get() = requireSystemService()
public val Context.wallpaperService: WallpaperService get() = requireSystemService()
public val Context.wifiAwareManager: WifiAwareManager get() = requireSystemService()
public val Context.wifiManager: WifiManager get() = requireSystemService()
public val Context.wifiP2pManager: WifiP2pManager get() = requireSystemService()
public val Context.windowManager: WindowManager get() = requireSystemService()

public inline fun <reified T : Any> Context.requireSystemService(): T =
  getSystemService() ?: error("Failed to find ${T::class.qualifiedName} from $this")
