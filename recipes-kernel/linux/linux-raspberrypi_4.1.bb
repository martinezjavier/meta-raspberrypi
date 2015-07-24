LINUX_VERSION ?= "4.1.0"

# Don't make this the default kernel, right now it is only for testing purposes
DEFAULT_PREFERENCE = "-1"

SRCREV = "07009cab090ade3dd180e8a55d590b1a00072eed"
SRC_URI = "git://github.com/anholt/linux.git;protocol=git;branch=vc4-kms-v3d-rpi2"

# Add patches needed for the vc4 driver but only if enabled as distro feature since are experimental
SRC_URI += "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'file://0001-ARM-bcm2709_defconfig-Enable-config-options-for-vc4-.patch', '', d)}"
SRC_URI += "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'file://0002-ARM-dts-Fix-i2c-for-bcm2709-RPI2-B-board.patch', '', d)}"
SRC_URI += "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'file://0003-drm-vc4-Use-the-fbdev_cma-helpers.patch', '', d)}"
SRC_URI += "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'file://0004-drm-vc4-Allow-vblank-to-be-disabled.patch', '', d)}"
SRC_URI += "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'file://0005-drm-vc4-Disable-KMS-operations.patch', '', d)}"

require linux-raspberrypi.inc
