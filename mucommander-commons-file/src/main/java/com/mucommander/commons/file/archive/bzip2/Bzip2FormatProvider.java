/**
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2016 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package com.mucommander.commons.file.archive.bzip2;

import com.mucommander.commons.file.AbstractFile;
import com.mucommander.commons.file.archive.AbstractArchiveFile;
import com.mucommander.commons.file.archive.ArchiveFormatProvider;
import com.mucommander.commons.file.filter.ExtensionFilenameFilter;
import com.mucommander.commons.file.filter.FilenameFilter;

import java.io.IOException;

/**
 * This class is the provider for the 'Bzip2' archive format implemented by {@link Bzip2ArchiveFile}.
 *
 * @see com.mucommander.commons.file.archive.bzip2.Bzip2ArchiveFile
 * @author Nicolas Rinaudo, Maxence Bernard
 */
public class Bzip2FormatProvider implements ArchiveFormatProvider {

    /** extensions of archive filenames */
    public static final String[] EXTENSIONS = new String[] {".bz2"};

    @Override
    public AbstractArchiveFile getFile(AbstractFile file) throws IOException {
        return new Bzip2ArchiveFile(file);
    }

    @Override
    public FilenameFilter getFilenameFilter() {
        return new ExtensionFilenameFilter(EXTENSIONS);
    }
}
