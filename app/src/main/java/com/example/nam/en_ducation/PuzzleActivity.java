package com.example.nam.en_ducation;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nam.en_ducation.model.Board;
import com.example.nam.en_ducation.model.Place;

/*
		 * @see BoardView
		* @see Board
		* @author Caio Lopes
		* @version 1.0 $
		*/
public class PuzzleActivity extends ActionBarActivity {

	/** The main view. */
	private ViewGroup mainView;

	/** The game board. */
	private Board board;

	/** The board view that generates the tiles and lines using 2-D graphics. */
	private BoardView boardView;

	/** Text view to show the user the number of movements. */
	private TextView moves;

	/** The board size. Default value is an 4x4 game. */
	private int boardSize = 4;

	/*
	 * (non-Javadoc)
	 *
	 * @see android.support.v7.app.ActionBarActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_puzzle);
		mainView = (ViewGroup) findViewById(R.id.mainLayout);
		moves = (TextView) findViewById(R.id.moves);
		moves.setTextColor(Color.WHITE);
		moves.setTextSize(20);
		this.newGame();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */

	/**
	 * Generates a new game.
	 */
	private void newGame() {
		this.board = new Board(this.boardSize);
		this.board.addBoardChangeListener(boardChangeListener);
		this.board.rearrange();
		this.mainView.removeView(boardView);
		this.boardView = new BoardView(this, board);
		this.mainView.addView(boardView);
		this.moves.setText("จำนวนครั้งที่เลื่อน: 0");
	}

	/**
	 * Changes the size of the board
	 *
	 * @param newSize
	 */
	public void changeSize(int newSize) {
		if (newSize != this.boardSize) {
			this.boardSize = newSize;
			this.newGame();
			boardView.invalidate();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */


	/** The board change listener. */
	private Board.BoardChangeListener boardChangeListener = new Board.BoardChangeListener() {
		public void tileSlid(Place from, Place to, int numOfMoves) {
			moves.setText("จำนวนครั้งที่เลื่อน: "
					+ Integer.toString(numOfMoves));
		}

		public void solved(int numOfMoves) {
			moves.setText("จำนวนครั้งที่เลื่อน " + Integer.toString(numOfMoves)
					+ " ครั้ง!");
			Toast.makeText(getApplicationContext(), "You won!",
					Toast.LENGTH_LONG).show();
		}
	};

	/**
	 * The Class SettingsDialogFragment. Shows the settings alert dialog in
	 * order to change the size of the board.
	 */
	public class SettingsDialogFragment extends DialogFragment {

		/** The size. */
		private int size;

		/**
		 * Instantiates a new settings dialog fragment.
		 *
		 * @param size
		 *            the size
		 */
		public SettingsDialogFragment(int size) {
			this.size = size;
		}

		/**
		 * Sets the size.
		 *
		 * @param size
		 *            the new size
		 */
		void setSize(int size) {
			this.size = size;
		}

		/**
		 * Gets the size.
		 *
		 * @return the size
		 */
		int getSize() {
			return this.size;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see
		 * android.support.v4.app.DialogFragment#onCreateDialog(android.os.Bundle
		 * )
		 */
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
			// Set the dialog title
			builder.setTitle("Define the size of the puzzle")
					.setSingleChoiceItems(R.array.size_options, this.size - 2,
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
													int which) {
									setSize(which + 2);

								}

							})
					.setPositiveButton("Change",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
													int id) {
									((PuzzleActivity) getActivity())
											.changeSize(getSize());
								}
							})
					.setNegativeButton("Cancel",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
													int id) {
									dialog.cancel();
								}
							});

			return builder.create();
		}
	}
}
