package dev.jonpoulton.alakazam.android.core

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

val Context.accessibilityManager: AccessibilityManager get() = requireSystemService()
val Context.accountManager: AccountManager get() = requireSystemService()
val Context.activityManager: ActivityManager get() = requireSystemService()
val Context.appOpsManager: AppOpsManager get() = requireSystemService()
val Context.appSearchManager: AppSearchManager get() = requireSystemService()
val Context.appWidgetManager: AppWidgetManager get() = requireSystemService()
val Context.audioManager: AudioManager get() = requireSystemService()
val Context.alarmManager: AlarmManager get() = requireSystemService()
val Context.batteryManager: BatteryManager get() = requireSystemService()
val Context.biometricManager: BiometricManager get() = requireSystemService()
val Context.blobStoreManager: BlobStoreManager get() = requireSystemService()
val Context.bluetoothManager: BluetoothManager get() = requireSystemService()
val Context.cameraManager: CameraManager get() = requireSystemService()
val Context.captioningManager: CaptioningManager get() = requireSystemService()
val Context.carrierConfigManager: CarrierConfigManager get() = requireSystemService()
val Context.clipboardManager: ClipboardManager get() = requireSystemService()
val Context.companionDeviceManager: CompanionDeviceManager get() = requireSystemService()
val Context.connectivityDiagnosticsManager: ConnectivityDiagnosticsManager get() = requireSystemService()
val Context.connectivityManager: ConnectivityManager get() = requireSystemService()
val Context.consumerIrManager: ConsumerIrManager get() = requireSystemService()
val Context.crossProfileApps: CrossProfileApps get() = requireSystemService()
val Context.devicePolicyManager: DevicePolicyManager get() = requireSystemService()
val Context.displayManager: DisplayManager get() = requireSystemService()
val Context.displayHashManager: DisplayHashManager get() = requireSystemService()
val Context.domainVerificationManager: DomainVerificationManager get() = requireSystemService()
val Context.downloadManager: DownloadManager get() = requireSystemService()
val Context.dropBoxManager: DropBoxManager get() = requireSystemService()
val Context.euiccManager: EuiccManager get() = requireSystemService()
val Context.fileIntegrityManager: FileIntegrityManager get() = requireSystemService()
val Context.gameManager: GameManager get() = requireSystemService()
val Context.hardwarePropertiesManager: HardwarePropertiesManager get() = requireSystemService()
val Context.inflater: LayoutInflater get() = requireSystemService()
val Context.inputManager: InputManager get() = requireSystemService()
val Context.inputMethodManager: InputMethodManager get() = requireSystemService()
val Context.ipSecManager: IpSecManager get() = requireSystemService()
val Context.imsManager: ImsManager get() = requireSystemService()
val Context.jobScheduler: JobScheduler get() = requireSystemService()
val Context.keyguardManager: KeyguardManager get() = requireSystemService()
val Context.launcherApps: LauncherApps get() = requireSystemService()
val Context.localeManager: LocaleManager get() = requireSystemService()
val Context.locationManager: LocationManager get() = requireSystemService()
val Context.mediaCommunicationManager: MediaCommunicationManager get() = requireSystemService()
val Context.mediaMetricsManager: MediaMetricsManager get() = requireSystemService()
val Context.mediaProjectionManager: MediaProjectionManager get() = requireSystemService()
val Context.mediaRouter: MediaRouter get() = requireSystemService()
val Context.mediaSessionManager: MediaSessionManager get() = requireSystemService()
val Context.midiManager: MidiManager get() = requireSystemService()
val Context.networkStatsManager: NetworkStatsManager get() = requireSystemService()
val Context.nfcManager: NfcManager get() = requireSystemService()
val Context.notificationManager: NotificationManager get() = requireSystemService()
val Context.nsdManager: NsdManager get() = requireSystemService()
val Context.peopleManager: PeopleManager get() = requireSystemService()
val Context.performanceHintManager: PerformanceHintManager get() = requireSystemService()
val Context.powerManager: PowerManager get() = requireSystemService()
val Context.printManager: PrintManager get() = requireSystemService()
val Context.restrictionsManager: RestrictionsManager get() = requireSystemService()
val Context.roleManager: RoleManager get() = requireSystemService()
val Context.searchManager: SearchManager get() = requireSystemService()
val Context.sensorManager: SensorManager get() = requireSystemService()
val Context.shortcutManager: ShortcutManager get() = requireSystemService()
val Context.statusBarManager: StatusBarManager get() = requireSystemService()
val Context.storageManager: StorageManager get() = requireSystemService()
val Context.storageStatsManager: StorageStatsManager get() = requireSystemService()
val Context.subscriptionManager: SubscriptionManager get() = requireSystemService()
val Context.systemHealthManager: SystemHealthManager get() = requireSystemService()
val Context.telecomManager: TelecomManager get() = requireSystemService()
val Context.telephonyManager: TelephonyManager get() = requireSystemService()
val Context.textClassificationManager: TextClassificationManager get() = requireSystemService()
val Context.textServicesManager: TextServicesManager get() = requireSystemService()
val Context.tvInputManager: TvInputManager get() = requireSystemService()
val Context.TvInteractiveAppManager: TvInteractiveAppManager get() = requireSystemService()
val Context.uiModeManager: UiModeManager get() = requireSystemService()
val Context.usageStatsManager: UsageStatsManager get() = requireSystemService()
val Context.usbManager: UsbManager get() = requireSystemService()
val Context.userManager: UserManager get() = requireSystemService()
val Context.vibrator: Vibrator get() = requireSystemService()
val Context.vibratorManager: VibratorManager get() = requireSystemService()
val Context.vpnManager: VpnManager get() = requireSystemService()
val Context.wallpaperService: WallpaperService get() = requireSystemService()
val Context.wifiAwareManager: WifiAwareManager get() = requireSystemService()
val Context.wifiManager: WifiManager get() = requireSystemService()
val Context.wifiP2pManager: WifiP2pManager get() = requireSystemService()
val Context.windowManager: WindowManager get() = requireSystemService()

inline fun <reified T : Any> Context.requireSystemService(): T =
  getSystemService() ?: error("Failed to find ${T::class.qualifiedName} from $this")
