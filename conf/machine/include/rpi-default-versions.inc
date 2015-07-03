# RaspberryPi BSP default versions

PREFERRED_VERSION_linux-raspberrypi ?= "${@bb.utils.contains("DISTRO_FEATURES", "vc4-gfx", "4.1.%", "3.18.%", d)}"
