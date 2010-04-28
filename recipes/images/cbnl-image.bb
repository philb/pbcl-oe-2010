export IMAGE_BASENAME = "cbnl-image"

DEPENDS = "task-boot \
    linux-atm \
    e2fsprogs \
    bridge-utils \
    iputils \
    sed \
    rsync \
    popt \
    less \
    wget \
    cron \
    thttpd \
    openssl \
    procps \
    "

IMAGE_INSTALL = "\
    task-boot \
    dropbear \
    xauth \
    gtk+ \
    gtk+-demo \
    linux-atm \
    e2fsprogs \
    bridge-utils \
    iputils \
    sed \
    rsync \
    popt \
    less \
    wget \
    cron \
    thttpd \
    openssl \
    procps \
    "

inherit image
