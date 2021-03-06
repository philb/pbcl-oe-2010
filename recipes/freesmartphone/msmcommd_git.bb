DESCRIPTION = "Low level protocol implementation for binary protocol spoken by some Qualcomm modems"
HOMEPAGE = "http://www.freesmartphone.org"
AUTHOR = "Simon Busch <morphis@gravedo.de>"
SECTION = "console/network"
LICENSE = "GPL"
DEPENDS = "libgee libfsotransport"
SRCREV = "2ed618dd347c3245c5f62c00ce75c985ad90a0ea"
PV = "0.1.0+gitr${SRCREV}"
PR = "r2"

SRC_URI = "${FREESMARTPHONE_GIT}/msmcomm.git;protocol=git;branch=master"
S = "${WORKDIR}/git"

inherit autotools_stage vala

PARALLEL_MAKE = ""

PACKAGES =+ "${PN}-lib ${PN}-term"
FILES_${PN}-lib = "${libdir}/lib*.so.*"
FILES_${PN}-term = "${sbindir}/msmvterm"

