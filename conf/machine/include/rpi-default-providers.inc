# RaspberryPi BSP default providers

PREFERRED_PROVIDER_virtual/kernel = "linux-raspberrypi"
PREFERRED_PROVIDER_u-boot = "u-boot-rpi"
PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"
PREFERRED_PROVIDER_virtual/egl ?= "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'mesa', 'userland', d)}"
PREFERRED_PROVIDER_virtual/libgles2 ?= "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'mesa', 'userland', d)}"
PREFERRED_PROVIDER_virtual/libgl ?= "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'mesa', 'mesa-gl', d)}"
PREFERRED_PROVIDER_virtual/mesa ?= "${@bb.utils.contains('DISTRO_FEATURES', 'vc4-gfx', 'mesa', 'mesa-gl', d)}"
PREFERRED_PROVIDER_jpeg = "jpeg"
