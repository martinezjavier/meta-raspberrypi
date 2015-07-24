LINUX_VERSION ?= "4.2.3"

SRCREV = "b8b2f50546513355fecd9ac44b2355f19a9620a8"
SRC_URI = "git://github.com/anholt/linux.git;protocol=git;branch=vc4-kms-v3d-rpi2 \
           file://0001-ARM-bcm2709_defconfig-Enable-config-options-for-vc4-.patch \
           file://0002-bcm2708-Fix-DTC-build-error.patch \
          "

require linux-raspberrypi.inc
